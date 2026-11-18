package com.mycompany.guiapplication;

public class ProductCalculation {
    
    implements IProductCalculations {
    private double price;
    
    public ProductCalculations(double price) {
        this.price= price;
        
    }
    @Override
    public double GetVat() {
        return price *0,15;
    }

    @Override
    public double GetCommission(){
        return price *0,05;
    }