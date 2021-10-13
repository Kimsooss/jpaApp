package com.soo.demo.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")//연관관계가 복잡할때ㅔ 이퀄세션코드에서 연관관계순환참조하니라 무한루프가능성있
@Builder
@AllArgsConstructor @NoArgsConstructor
public class Account {
	@Id @GeneratedValue
	private Long id;
	
	@Column(unique = true)
	private String eamil;
	@Column(unique = true)
	private String nickname;
	
	private String password;
	
	private boolean emailVerified;
	
	private String emailCheckToken;
	
	private LocalDateTime joinedAt;

	private String bio;
	
	private String url;
	
	private String occupation;
	
	private String location;//varchar(255)
	
	@Lob @Basic(fetch = FetchType.EAGER)
	private String profileImage;//
	
	private boolean studyCreatedByEmail;

	private boolean studyCreatedByWeb;
	
	private boolean studyEnrollmentResultbyEmail;
	
	private boolean studyEnrollmentResultbyWeb;
	
	private boolean studyUpdatedByWeb;
	
	private boolean studyUpdatedByEmail;
	
}
