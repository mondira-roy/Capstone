package com.example.dao;

import com.example.model.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsoleDaoJdbcTemplateImplTest {
    /*@Autowired
    ConsoleDao consoleDao;*/
    /*@Autowired
    InvoiceDao invoiceDao;
    @Autowired
    GameDao gameDao;
    @Autowired
    TShirtDao tShirtDao;
    @Autowired
    SalesTaxRateDao salesTaxRateDao;
    @Autowired
    ProcessingFeeDao processingFeeDao;*/

    @Before
    public void setUp() throws Exception { /*
        List<Console> consoles = consoleDao.getAllConsoles();
        for (Console con : consoles) {
            consoleDao.deleteConsole(con.getConsoleId());
        }

        List<Invoice> invoices = invoiceDao.getAllInvoices();
        for (Invoice i : invoices) {
            invoiceDao.deleteInvoice(i.getInvoiceId());
        }

        List<Game> games = gameDao.getAllGames();
        for (Game g : games) {
            gameDao.deleteGame(g.getGameId());
        }

        List<TShirt> tshirts = tShirtDao.getAllTShirts();
        for (TShirt c : tshirts) {
            tShirtDao.deleteTShirt(c.getTShirtId());
        }
        List<SalesTaxRate> sales = salesTaxRateDao.getAllSalesTaxRates();
        for (SalesTaxRate s : sales) {
            salesTaxRateDao.deleteSalesTaxRate(s.getRate().toString());
        }
        List<TShirt> tsh = tShirtDao.getAllTShirts();
        for (TShirt c : tsh) {
            tShirtDao.deleteTShirt(c.getTShirtId());
        }
    */}

    /*@Test
    public void addGetDeleteConsole() {
        Console console = new Console();
        console.setModel("Model1");
        console.setManufacturer("Manufacturer1");
        console.setMemoryAmount("MemoryAmount1");
        console.setProcessor("Processor1");
        console.setPrice(BigDecimal.valueOf(125.99));

        console = consoleDao.addConsole(console);

        Console console1 = consoleDao.getConsole(console.getConsoleId());
        assertEquals(console1, console);

        consoleDao.deleteConsole(console.getConsoleId());
        console1 = consoleDao.getConsole(console.getConsoleId());
        assertNull(console1);
    }*/

    @Test
    public void getConsoleByManufacturer() {
       /* Console console = new Console();
        console.setConsoleId(1);
        console.setModel("Model1");
        console.setManufacturer("Manufacturer1");
        console.setMemoryAmount("MemoryAmount1");
        console.setProcessor("Processor1");
        console.setPrice(BigDecimal.valueOf(125.99));*/
        /*consoleDao.addConsole(console);

         Console console1 = consoleDao.getConsole(Integer.parseInt(console.getManufacturer()));
        assertEquals(console1, console);*/
    }

    /*@Test
    public void getAllConsoles() {
        Console console = new Console();
        console.setModel("Model1");
        console.setManufacturer("Manufacturer1");
        console.setMemoryAmount("MemoryAmount1");
        console.setProcessor("Processor1");
        console.setPrice(BigDecimal.valueOf(125.99));

        console = consoleDao.addConsole(console);

        console = new Console();
        console.setModel("Model2");
        console.setManufacturer("Manufacturer2");
        console.setMemoryAmount("MemoryAmount2");
        console.setProcessor("Processor2");
        console.setPrice(BigDecimal.valueOf(250.99));
        console = consoleDao.addConsole(console);

        List<Console> cList = consoleDao.getAllConsoles();
        assertEquals(2, cList.size());


    }*/

    /*@Test
    public void updateConsole() {
        Console console = new Console();
        console.setModel("Model1");
        console.setManufacturer("Manufacturer1");
        console.setMemoryAmount("MemoryAmount1");
        console.setProcessor("Processor1");
        console.setPrice(BigDecimal.valueOf(125.99));

        console = consoleDao.addConsole(console);

        console = new Console();
        console.setModel("Model2");
        console.setManufacturer("Manufacturer2");
        console.setMemoryAmount("MemoryAmount2");
        console.setProcessor("Processor2");
        console.setPrice(BigDecimal.valueOf(250.99));

        consoleDao.updateConsole(console);

        Console console1 = consoleDao.getConsole(console.getConsoleId());
        assertEquals(console1, console);
    }*/


}