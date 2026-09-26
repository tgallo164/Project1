package edu.towson.cis.cosc442.project1.monopoly;

public abstract class Cell {
	private boolean available = true;
	private String name;
	protected Player theOwner;

	/**
	 * Retrieves the name of this cell.
	 * @return The name of the cell.
	 */
	/**
	 * Retrieves the name of this cell.
	 * @return The name of the cell.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the current owner of this cell.
	 * @return The player who owns this cell, or null if unowned.
	 */
	/**
	 * Gets the current owner of this cell.
	 * @return The player who owns this cell, or null if unowned.
	 */
	public Player getTheOwner() {
		return theOwner;
	}
	
	/**
	 * Returns the price of this cell; default is 0.
	 * @return The price of the cell, zero by default.
	 */
	/**
	 * Returns the price of this cell; default is 0.
	 * @return The price of the cell, zero by default.
	 */
	public int getPrice() {
		return 0;
	}

	/**
	 * Indicates whether this cell is currently available.
	 * @return True if the cell is available, false otherwise.
	 */
	/**
	 * Indicates whether this cell is currently available.
	 * @return True if the cell is available, false otherwise.
	 */
	public boolean isAvailable() {
		return available;
	}
	
	/** 
	 * @param available
	 */
	/** 
	 * @param available
	 */
	/**
	 * Defines the action to execute when a player lands on this cell.
	 */
	/**
	 * Defines the action to execute when a player lands on this cell.
	 */
	public abstract void playAction();

	/**
	 * Sets the availability status of this cell.
	 * @param available The availability status to set for the cell.
	 */
	/**
	 * Sets the availability status of this cell.
	 * @param available The availability status to set for the cell.
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	/**
	 * Assigns a name to this cell.
	 * @param name The name to assign to the cell.
	 */
	/**
	 * Assigns a name to this cell.
	 * @param name The name to assign to the cell.
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the owner of this cell to the specified player.
	 * @param owner The player to assign as the owner of the cell.
	 */
	/**
	 * Sets the owner of this cell to the specified player.
	 * @param owner The player to assign as the owner of the cell.
	 */
	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    /**
     * Returns the string representation of the cell.
     * @return The name of the cell as its string representation.
     */
    /**
     * Returns the string representation of the cell.
     * @return The name of the cell as its string representation.
     */
    public String toString() {
        return name;
    }
}
