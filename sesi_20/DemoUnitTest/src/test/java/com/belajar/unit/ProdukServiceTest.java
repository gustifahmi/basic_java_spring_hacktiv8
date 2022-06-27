package com.belajar.unit;

import static org.mockito.Mockito.times;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import com.belajar.unit.model.Produk;
import com.belajar.unit.repository.ProdukRepository;
import com.belajar.unit.service.ProdukService;
import com.belajar.unit.service.impl.ProdukServiceImpl;

@RunWith(SpringRunner.class)
public class ProdukServiceTest {
	
	@InjectMocks
	private ProdukService produkService = new ProdukServiceImpl();
	
	@Mock
	private ProdukRepository produkRepository;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		ReflectionTestUtils.setField(produkService, "produkRepository", produkRepository);
	}
	
	@Test
	public void testGetAll() {
		final List<Produk> produk = TestObjectFactory.createProductList(10);
	
		Mockito.when(produkRepository.findAll()).thenReturn(produk);
	
		final List<Produk> actual = produkService.getAllProduk();
		
		MatcherAssert.assertThat(actual.size(), Matchers.equalTo(produk.size()));
	}
	
	@Test
	public void testProdukById() throws Exception {
		final Long id = new Random().nextLong();
		final Produk produk = TestObjectFactory.createProduk();
	
		Mockito.when(produkRepository.findById(id)).thenReturn(Optional.of(produk));
	
		final Produk actual = produkService.getProduk(id);
		
		MatcherAssert.assertThat(actual.getId(), Matchers.equalTo(produk.getId()));
		MatcherAssert.assertThat(actual.getNama(), Matchers.equalTo(produk.getNama()));
		MatcherAssert.assertThat(actual.getHargaBeli(), Matchers.equalTo(produk.getHargaBeli()));
		MatcherAssert.assertThat(actual.getHargaJual(), Matchers.equalTo(produk.getHargaJual()));
	}
	

	@Test
	public void testProductByIdWithNullDataFromDB() throws Exception {
		final Long id = new Random().nextLong();

		Mockito.when(produkRepository.findById(id)).thenReturn(Optional.empty());
		final Produk actual = produkService.getProduk(id);
		MatcherAssert.assertThat(actual, Matchers.notNullValue());
	}

	@Test
	public void testSaveUpdateProduct() {
		final Produk produk = TestObjectFactory.createProduk();
		Mockito.when(produkRepository.save(produk)).thenReturn(produk);

		final Produk actual = produkService.saveProduk(produk);;
		MatcherAssert.assertThat(actual, Matchers.notNullValue());
	}

	@Test
	public void testDeleteProduct() {
		final Long id = new Random().nextLong();
		Produk produk = TestObjectFactory.createProduk();

		Mockito.when(produkRepository.findById(id)).thenReturn(Optional.of(produk));
		Mockito.doNothing().when(produkRepository).delete(produk);
		produkService.deleteProduk(id);

		Mockito.verify(produkRepository, times(1)).deleteById(id);;
	}
}