import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Placar here.
 * 
 * @author (Jhonatan Morais - jhonatanvinicius@gmail.com | jhonatan@dfjug.org) 
 * @version (1.0)
 */
public class Placar extends Actor
{
    public Placar(){
        atualizaImagem(0);
    }

    /**
     * Act - do whatever the Placar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        atualizaImagem(0);

    } 
    /**
	* prove atualização para a imagem do placar.
	*/
    private void atualizaImagem(int valor ){

        GreenfootImage placar = new GreenfootImage(converteNumero(valor),24,Color.WHITE,new Color(0,0,0,0),Color.BLACK);
        setImage(placar);

    }

    private String converteNumero(int valor){

        return String.format("%010d",valor);

    } 

}
