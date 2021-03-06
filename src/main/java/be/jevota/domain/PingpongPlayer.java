package be.jevota.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import be.jevota.domain.interfaces.Markeable;
import be.jevota.domain.type.Ranking;

@Entity
public class PingpongPlayer implements Markeable {

	@Id @GeneratedValue private Long id;

	@NotNull private String firstName;
	@NotNull private String lastName;

	@Enumerated(EnumType.STRING) private Ranking ranking;

	@Embedded private Address address = new Address();

	@LazyCollection(LazyCollectionOption.FALSE) @ManyToMany(mappedBy = "players") private List<Role> roles;

	@ManyToMany(mappedBy = "players") private List<GameLineup> lineups;

	@Column(unique = true) private Integer memberNo;

	@LazyCollection(LazyCollectionOption.FALSE) @ElementCollection @CollectionTable(name = "phone_numbers", joinColumns = @JoinColumn(name = "playerId")) @Column(name = "phoneNumber") private List<String> phoneNumbers;

	@Column(unique = true) private String emailAddress;
	private String password;
	private boolean recreation;
	private boolean active;
	private boolean male;
	private Date createDate;
	private Date lastLoginDate;
	@Transient private int index;

	@Column(unique = true) private String vttlId;

	public String getFullName() {
		return String.format("%s %s", firstName, lastName);
	}

	public String getShortName() {
		return String.format("%s %s.", firstName, lastName.substring(0, 1));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(Integer memberNo) {
		this.memberNo = memberNo;
	}

	public Ranking getRanking() {
		return ranking;
	}

	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRecreation() {
		return recreation;
	}

	public void setRecreation(boolean recreation) {
		this.recreation = recreation;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getRecreationChar() {
		return recreation ? "R" : "";
	}

	public String getActiveChar() {
		return active ? "A" : "";
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public List<Role> getRoles() {
		if (roles == null) {
			roles = new ArrayList<Role>();
		}
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<GameLineup> getLineups() {
		return lineups;
	}

	public void setLineups(List<GameLineup> lineups) {
		this.lineups = lineups;
	}

	public String getVttlId() {
		return vttlId;
	}

	public void setVttlId(String vttlId) {
		this.vttlId = vttlId;
	}

	public String getMarkerTitle() {
		return getFullName();
	}

	@Override
	public String toString() {
		return getFullName();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PingpongPlayer other = (PingpongPlayer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
