package com.wv.mfaraji.spring.jenkinsdocker;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@ToString
public class ThemeParkRide {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  @NotEmpty
  private String name;
  @NotEmpty
  private String description;
  private int thrillFactor;
  private int vomitFactor;
  
  
  public ThemeParkRide() {}
  
  public ThemeParkRide(String name, String description, int thrillFactor, int vomitFactor) {
	super();
    this.name = name;
    this.description = description;
    this.thrillFactor = thrillFactor;
    this.vomitFactor = vomitFactor;
  }

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getThrillFactor() {
		return thrillFactor;
	}
	
	public void setThrillFactor(int thrillFactor) {
		this.thrillFactor = thrillFactor;
	}
	
	public int getVomitFactor() {
		return vomitFactor;
	}
	
	public void setVomitFactor(int vomitFactor) {
		this.vomitFactor = vomitFactor;
	}
  
  
  
  
}