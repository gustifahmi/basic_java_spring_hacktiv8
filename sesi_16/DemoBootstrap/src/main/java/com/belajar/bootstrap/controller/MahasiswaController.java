package com.belajar.bootstrap.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import com.belajar.bootstrap.model.Mahasiswa;
import com.belajar.bootstrap.repository.MahasiswaRepository;

@Controller
public class MahasiswaController {
	private final static Logger LOGGER = LoggerFactory.getLogger(MahasiswaController.class.getName());
	
	@Autowired
	private MahasiswaRepository mahasiswaRepository;
	
	@GetMapping("/index")
	public ModelMap getAll(Pageable pageable) {
		return new ModelMap().addAttribute("mahasiswa", mahasiswaRepository.findAll(pageable));
	}
	
	@GetMapping("/")
	public String index() {
		return "redirect:/index";
	}
	
	@GetMapping("/mahasiswa/form-tambah")
    public ModelMap tampilFormTambah(@RequestParam(required = false, value = "id") Mahasiswa mahasiswa) {
		mahasiswa = new Mahasiswa();
        return new ModelMap().addAttribute("mahasiswa", mahasiswa);
    }

	@PostMapping("/mahasiswa/form-tambah")
	public String tambahMahasiswa(@ModelAttribute @Valid Mahasiswa mahasiswa, BindingResult errors, SessionStatus status) {
        LOGGER.info(mahasiswa.toString());
        LOGGER.info(errors.toString());
        LOGGER.info("" + errors.hasErrors());
        LOGGER.info("" + errors.hasGlobalErrors());
        if (errors.hasErrors())
            return "/mahasiswa/form-tambah";
        try {
            mahasiswaRepository.save(mahasiswa);
            status.setComplete();
            return "redirect:/index";
        } catch (DataAccessException e) {
            errors.reject("error.object", e.getMessage());
            LOGGER.error(e.getMessage());
            return "/mahasiswa/form-tambah";
        }
    }

	@GetMapping("/mahasiswa/form-edit")
    public ModelMap tampilFormEdit(@RequestParam(required = false, value = "id") Mahasiswa mahasiswa) {
        return new ModelMap().addAttribute("mahasiswa", mahasiswa);
    }
	
    @PostMapping("/mahasiswa/form-edit")
    public String editMahasiswa(@RequestParam(value="id") String id, @ModelAttribute @Valid Mahasiswa editedMahasiswa, BindingResult errors, SessionStatus status) {
        LOGGER.info(editedMahasiswa.toString());
        LOGGER.info(errors.toString());
        LOGGER.info("" + errors.hasErrors());
        LOGGER.info("" + errors.hasGlobalErrors());
        if (errors.hasErrors())
            return "/mahasiswa/form-edit";
        try {
        	Mahasiswa existingMahasiswa = mahasiswaRepository.getById(id);
        	existingMahasiswa.setNim(editedMahasiswa.getNim());
        	existingMahasiswa.setNama(editedMahasiswa.getNama());
        	existingMahasiswa.setJurusan(editedMahasiswa.getJurusan());
        	existingMahasiswa.setIpk(editedMahasiswa.getIpk());
            mahasiswaRepository.save(existingMahasiswa);
            status.setComplete();
            return "redirect:/index";
        } catch (DataAccessException e) {
            errors.reject("error.object", e.getMessage());
            LOGGER.error(e.getMessage());
            return "/mahasiswa/form-edit";
        }
    }
    
    @GetMapping("/mahasiswa/detail-form")
    public ModelMap tampilFormDetail(@RequestParam(required = false, value = "id") Mahasiswa mahasiswa) {
        if (mahasiswa == null) {
            mahasiswa = new Mahasiswa();
        }
        return new ModelMap().addAttribute("mahasiswa", mahasiswa);
    }

    @RequestMapping(value = "/mahasiswa/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String hapusMahasiswa(String id) {
    	Mahasiswa mahasiswa = mahasiswaRepository.findById(id)
    		      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        mahasiswaRepository.delete(mahasiswa);
        return "redirect:/index";
    }
}
