package com.example.foodrecipeapp.Models;

import java.util.ArrayList;

public class Step<Ingredient> {
    public int number;
    public String step;
    public ArrayList<Ingredient> ingredients;
    public ArrayList<Equipment> equipment;
    public Length length;
}
