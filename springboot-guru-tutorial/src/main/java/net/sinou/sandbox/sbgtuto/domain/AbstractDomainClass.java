package net.sinou.sandbox.sbgtuto.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.data.annotation.Version;

@MappedSuperclass
public class AbstractDomainClass implements DomainObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;

	@Version
	private Integer version;

	private Date dateCreated;
	private Date lastUpdated;

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	@PreUpdate
	@PrePersist
	public void updateTimeStamps() {
		Date now = new Date();
		lastUpdated = now;
		if (dateCreated == null) {
			dateCreated = now;
		}
	}
}
