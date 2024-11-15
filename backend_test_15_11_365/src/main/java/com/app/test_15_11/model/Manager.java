package com.app.test_15_11.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.test_15_11.model.Manager;
import com.app.test_15_11.model.Pet;
import com.app.test_15_11.model.PetCareCenter;
import com.app.test_15_11.model.PetOwner;
import com.app.test_15_11.model.Document;
import com.app.test_15_11.model.PetService;
import com.app.test_15_11.enums.PetServiceType;
import com.app.test_15_11.converter.PetServiceTypeConverter;
import com.app.test_15_11.converter.DurationConverter;
import com.app.test_15_11.converter.UUIDToByteConverter;
import com.app.test_15_11.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Manager")
@Table(name = "\"Manager\"", schema =  "\"test_15_11_163\"")
@Data
                        
public class Manager {
	public Manager () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"MId\"", nullable = true )
  private Integer mId;
	  
  @Column(name = "\"FullName\"", nullable = true )
  private String fullName;
  
	  
  @Column(name = "\"ContactNumber\"", nullable = true )
  private String contactNumber;
  
	  
  @Column(name = "\"Address\"", nullable = true )
  private String address;
  
	  
  @Column(name = "\"SecondaryContactNumber\"", nullable = true )
  private String secondaryContactNumber;
  
	  
  @Column(name = "\"Pincode\"", nullable = true )
  private Integer pincode;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Manager [" 
  + "MId= " + mId  + ", " 
  + "FullName= " + fullName  + ", " 
  + "ContactNumber= " + contactNumber  + ", " 
  + "Address= " + address  + ", " 
  + "SecondaryContactNumber= " + secondaryContactNumber  + ", " 
  + "Pincode= " + pincode 
 + "]";
	}
	
}