package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    private static final String NOTEBOOK = ("Notebook A3, hard cover");
    private static final String PENCIL = ("Pencil HB, black/green");

    @Test
    public void testInvoiceDaoSave(){
    //Given
        Product product1 = new Product(NOTEBOOK);
        Product product2 = new Product(PENCIL);

        Invoice invoice = new Invoice("#001");


        Item item1 = new Item(new BigDecimal(5.5),65);
        Item item2 = new Item(new BigDecimal(1.2),110);

        item1.setProduct(product1);
        item1.setInvoice(invoice);
        item2.setProduct(product2);
        item2.setInvoice(invoice);

        product1.getItems().add(item1);
        invoice.getItems().add(item1);
        product2.getItems().add(item2);
        invoice.getItems().add(item2);

    //When
        invoiceDao.save(invoice);
        productDao.save(product1);
        productDao.save(product2);
        itemDao.save(item1);
        itemDao.save(item2);

        int idForInvoice = invoice.getId();
        int idForProduct = product1.getId();
        int idForItem = item1.getId();

    //Then
        Assert.assertNotEquals(0, idForInvoice);
        Assert.assertNotEquals(0, idForProduct);
        Assert.assertNotEquals(0, idForItem);

    //Clean-up
        itemDao.deleteAll();
        productDao.deleteAll();
        invoiceDao.deleteAll();
    }
}
