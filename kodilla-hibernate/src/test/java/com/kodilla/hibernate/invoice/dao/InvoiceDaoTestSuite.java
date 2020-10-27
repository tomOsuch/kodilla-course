package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Item computersItem = new Item(new BigDecimal("6700"), 2, new BigDecimal("14000"));
        Item electronicsItem = new Item(new BigDecimal("10000"), 2, new BigDecimal("1"));
        Product computer = new Product("Computer");
        computersItem.setProduct(computer);
        electronicsItem.setProduct(computer);

        Invoice invoice = new Invoice("AB-123");
        computersItem.setInvoice(invoice);
        electronicsItem.setInvoice(invoice);
        invoice.getItems().add(computersItem);
        invoice.getItems().add(electronicsItem);
        //When
        productDao.save(computer);
        invoiceDao.save(invoice);
        //Then
        assertNotEquals(0, computer.getId());
        assertNotEquals(0, invoice.getId());
        assertEquals(computer.getId(), computersItem.getProduct().getId());
        assertEquals(invoice.getId(), computersItem.getInvoice().getId());
        assertEquals(invoice.getId(), electronicsItem.getInvoice().getId());
        //CleanUp
        //productDao.deleteAll();
        //invoiceDao.deleteAll();
        //itemDao.deleteAll();

    }
}
