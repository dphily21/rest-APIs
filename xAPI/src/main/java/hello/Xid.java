package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
public class Xid {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer subset_xid_id;
    private Date create_date;
    private Date modify_date;
    private Integer organization_id;
    private String subset_name;


	public Integer getSubset_xid_id() {
		return subset_xid_id;
	}

	public void setSubset_xid_id(Integer subset_xid_id) {
		this.subset_xid_id = subset_xid_id;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getModify_date() {
		return modify_date;
	}

	public void setModify_date(Date modify_date) {
		this.modify_date = modify_date;
	}

	public Integer getOrganization_id() {
		return organization_id;
	}

	public void setOrganization_id(Integer organization_id) {
		this.organization_id = organization_id;
	}

	public String getSubset_name() {
		return subset_name;
	}

	public void setSubset_name(String subset_name) {
		this.subset_name = subset_name;
	}


    
    
}
