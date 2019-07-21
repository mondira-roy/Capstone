package com.example.service;

import com.example.dao.*;
import com.example.viewModel.ConsoleViewModel;
import com.example.viewModel.GameViewModel;
import com.example.viewModel.InvoiceViewModel;
import com.example.viewModel.TShirtViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InventoryService {
    ConsoleDao consoleDao;
    GameDao gameDao;
    InvoiceDao invoiceDao;
    TShirtDao tShirtDaoDao;
    SalesTaxRateDao salesTaxRateDao;
    ProcessingFeeDao processingFeeDao;

    @Autowired
    public InventoryService(ConsoleDao consoleDao, GameDao gameDao,
                            InvoiceDao invoiceDao, TShirtDao tShirtDaoDao, SalesTaxRateDao salesTaxRateDao, ProcessingFeeDao processingFeeDao) {
        this.consoleDao = consoleDao;
        this.gameDao = gameDao;
        this.invoiceDao = invoiceDao;
        this.tShirtDaoDao = tShirtDaoDao;
        this.salesTaxRateDao = salesTaxRateDao;
        this.processingFeeDao = processingFeeDao;
    }

    public InvoiceViewModel saveInvoice(InvoiceViewModel invoice) {
        return null;
    }

    public InvoiceViewModel findInvoice(int id) {
        return null;
    }

    public void removeInvoice(int id) {
        invoiceDao.deleteInvoice(id);
    }

    public void updateInvoice(InvoiceViewModel invoiceViewModel) {

    }

    //=======================TShirt==============
    public TShirtViewModel saveTShirt(TShirtViewModel tshirt) {
        return null;
    }

    public TShirtViewModel findTShirt(int tShirtId) {
        return null;
    }

    public void updateTShirt(TShirtViewModel tShirtViewModel) {

    }

    public void removeTShirt(int tShirtId, TShirtDao tShirtDao) {
        tShirtDao.deleteTShirt(tShirtId);
    }

    // =====================GAME===============
    public GameViewModel saveGame(GameViewModel gameViewModel) {
        return null;
    }

    public GameViewModel findGame(int gameId) {
        return null;
    }

    public void removeGame(int gameId) {

        gameDao.deleteGame(gameId);
    }

    public void updateGame(GameViewModel gameviewModel) {

    }

    //===============console==============
    public void updateConsole(ConsoleViewModel consoleviewModel) {
    }

    public void removeConsole(int consoleId) {
        consoleDao.deleteConsole(consoleId);
    }

    public ConsoleViewModel saveConsole(ConsoleViewModel console) {
        return null;
    }

    public ConsoleViewModel findConsolebyId(int consoleId) {
        return null;
    }

    /*public SalesTaxRateViewModel saveTax(SalesTaxRateModel tax) {
        return null;

    }*/
}
