package io.j4c.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDO {

	/**
	 * Customer's first name
	 */
	@JsonProperty(value="firstname")
	private String firstName;
    
	/**
	 * Customer's last name
	 */
	@JsonProperty(value="lastname")
	private String lastName;
   	
	/**
	 * Customer's date of birth
	 */
	@JsonProperty(value="dateofbirth")
	private String birthDate;
	
	/**
	 * Customer's PAN
	 */
	@JsonProperty(value="pan")
	private String pan;
	
	/**
	 * Customer's score
	 */
	private int score;

    public CustomerDO() {
    }

    public CustomerDO(String firstName, String lastName, String birthDate, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.pan = pan;
    }

    /**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the birthDate
	 */
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	@Override
    public String toString() {
        return "Customer {"
                + "First name='" + this.firstName + '\''
                + ", Last name=" + this.lastName
                + ", Date of birth=" + this.birthDate
                + ", PAN=" + this.pan
                + '}';
    }

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}
    
    
} 
