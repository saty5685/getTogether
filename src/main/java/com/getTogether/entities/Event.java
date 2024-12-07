package com.getTogether.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "events")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eventID;
	
	@OneToOne
	private User eventLeader;
	
	@OneToOne
	private Address eventAddress;
	
	@ManyToMany
	private List<User> participants;
	
	private String eventDescription;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date eventTime;

	public Long getEventID() {
		return eventID;
	}

	public void setEventID(Long eventID) {
		this.eventID = eventID;
	}

	public User getEventLeader() {
		return eventLeader;
	}

	public void setEventLeader(User eventLeader) {
		this.eventLeader = eventLeader;
	}

	public Address getEventAddress() {
		return eventAddress;
	}

	public void setEventAddress(Address eventAddress) {
		this.eventAddress = eventAddress;
	}

	public List<User> getParticipants() {
		return participants;
	}

	public void setParticipants(List<User> participants) {
		this.participants = participants;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public Date getEventTime() {
		return eventTime;
	}

	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}
	
	
	

}
