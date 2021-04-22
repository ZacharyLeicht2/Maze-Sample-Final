import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        //Top Wall
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i, 12);
        }
        
        //Bottom Wall
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i, 587);
        }
        
        //Left Wall
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge2.png"), 12, 25 + 50*i);
        }

        //Right Wall
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge2.png"), 787, 25 + 50*i);
        }
        
        //Partial wall in top left of maze
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i, 150);
        }
        //Partial wall in top right of maze
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge.png"), 525 + 50*i, 150);
        }
        
        //Partial vertical wall middle starting (350,163)
        for(int i = 0; i < 4; i++)
        {
            addObject( new Wall("edge2.png"), 350, 163 + 50*i);
        }
        //Partial vertical wall middle starting (350,463)
        for(int i = 0; i < 4; i++)
        {
            addObject( new Wall("edge2.png"), 350, 463 + 50*i);
        }
        
        //Partial vertical wall left side starting (185,280)
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge2.png"), 185, 280 + 50*i);
        }
        
        //Partial horizontal wall starting (363,325)
        for(int i = 0; i < 6; i++)
        {
            addObject( new Wall("edge.png"), 363 + 50*i, 325);
        }
        
        //Partial horizontal wall starting (363,450)
        for(int i = 0; i < 6; i++)
        {
            addObject( new Wall("edge.png"), 363 + 50*i, 450);
        }
        
    }
}
