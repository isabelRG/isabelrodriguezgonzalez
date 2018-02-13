/***********************
Dog.java

Isabel Rodriguez Gonzalez
This class sets tehe dog´s properties and methods
**************************/
import jvax.swing.*;
public class Dog{
  //Dog´s Properties - Variables
  private String color;
  private String eyeColor;
  private Double height;
  private Double length;
  private Double weight;

  /*metodo tipo de dato GET = obtener
  metodo void SET = establecer*/

  //sets the dog´s color
  public void setColor(String dogColor){
    color=dogColor;
  }
  //gets the dog´s color
  public void getColor(){
    return color;
  }

  //sets dog´s eyeColor
  public void setEyeColor(String dogEyeColor){
    eyeColor=dogEyeColor;
  }
  //gets dog´s eyeColor
  public String getEyeColor(){
    return eyeColor;
  }

  //sets dog´s height
  public Double setHeight(Double dogHeight){
    height = dogHeight;
  }
  //get´s dog´s height
  public Double getHeight(Double dogHeight){
    return height;
  }

//get´s dog´s length
  public Double setLength(Double dogLength){
    length = dogLength;
  }
  //get´s dog´s length
  public Double getLenth(Double dogLength){
    return length;
  }

//set´s dog´s weight
  public Double setWeight(Double dogWeight){
    weight = dogWeight;
  }
  //get´s dog´s weight
public Double getWeight(Double dogWeight){
  return weight;
}

  //Dog´s Methods - Actions
  //sit Method
  public void sit(){
    JOptionPane.showMessageDialog(null, "The dog is sat");
  }

  //Bark Method
  public void bark(){
    JOptionPane.showMessageDialog(null, "The dog is barking");
  }

  //Lay Down Method
  public void layDown(){
    JOptionPane.showMessageDialog(null, "The dog is laid down");
  }

  //Eat Method
  public void eat(){
    JOptionPane.showMessageDialog(null, "The dog is eating");
  }

  // Sleep Method
  public void sleep(){
    JOptionPane.showMessageDialog(null, "The dog is sleeping");
  }
}
