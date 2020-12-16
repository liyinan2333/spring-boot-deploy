package leoli.deploy.service.bean.po;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "JOB")
public class JobPo implements Serializable {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private  @Column(name = "JOB_ID") Long jobId;

	private  @Column(name = "CRON") String cron;

	private  @Column(name = "CLS_NM") String clsNm;

	private  @Column(name = "JOB_NM") String jobNm;

	private  @Column(name = "ENABLED") String enabled;

	private  @Column(name = "UPDTR") String updtr;

	private  @Column(name = "UPD_TM") Date updTm;

	private  @Column(name = "CRTR") String crtr;

	private  @Column(name = "CRT_TM") Date crtTm;

}
