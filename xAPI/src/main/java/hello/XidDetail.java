package hello;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "xid_detail")
public class XidDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer xid_detail_id;
	private Integer node_id;
	@Column(name = "subset_xid_id")
	private Integer subsetXidId;
	private Integer component_order;
	private String component_name;
	private Boolean nillable;
	private String node_type;
	private Integer parent_id;
	private Boolean repeats;
	private Boolean required;
	private String xpath;
	private String occurs;
	private String char_type;
	private String length;
	private String regex_or_value;
	private String field_description;
	private String business_rules;
	private String field_name;
	private Boolean has_children;
	private Boolean has_enum;
	private String selected_enum_values;
	private String max_occurs;
	private String min_occurs;

}