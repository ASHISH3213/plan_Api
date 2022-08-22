package in.ashish.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
@Entity
public class PlanCategory {
	private Integer categoryId;
	private String categoryName;
	
	private String activeSw;
	
	private String creatdBy;
	private String updatedBy;
	
	private LocalDate createDate;
	private LocalDate updateDate;
	

}
