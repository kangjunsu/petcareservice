package com.bitcamp.petcare.mypage.mapper;

import java.util.List;

import com.bitcamp.petcare.mypage.domain.ActivityPhotoDTO;
import com.bitcamp.petcare.mypage.domain.ActivityPhotoVO;
import com.bitcamp.petcare.mypage.domain.PetsitterProfileDTO;
import com.bitcamp.petcare.mypage.domain.PetsitterProfileVO;
import com.bitcamp.petcare.mypage.domain.PetsitterSkillDTO;
import com.bitcamp.petcare.mypage.domain.PetsitterSkillVO;
import com.bitcamp.petcare.mypage.domain.ServiceCalendarDTO;
import com.bitcamp.petcare.mypage.domain.ServiceCalendarVO;
import com.bitcamp.petcare.mypage.domain.ServicePetkindsDTO;
import com.bitcamp.petcare.mypage.domain.ServicePetkindsVO;
import com.bitcamp.petcare.mypage.domain.ServiceTypeDTO;
import com.bitcamp.petcare.mypage.domain.ServiceTypeVO;

public interface SitterProfileManageMapper {
	
	// select
	public abstract PetsitterProfileVO getPetsitterProfile(Integer userNo); 
	public abstract List<ServiceTypeVO> getServiceType(Integer userNo);			
	public abstract List<PetsitterSkillVO> getPetsitterSkill(Integer userNo);		 
	public abstract List<ServicePetkindsVO> getServicePetKinds(Integer userNo);	 
	public abstract List<ServiceCalendarVO> getServiceCalendar(Integer userNo);	 	
	public abstract List<ActivityPhotoVO> getActivityPhoto(Integer userNo);
	
	// insert
	public abstract int insertPetsitterProfile(PetsitterProfileDTO dto);
	public abstract int insertServiceType(ServiceTypeDTO dto);	
	public abstract int insertPetsitterSkill(PetsitterSkillDTO dto);
	public abstract int insertServicePetkinds(ServicePetkindsDTO dto);
	public abstract int insertServiceCalendar(ServiceCalendarDTO dto);
	public abstract int insertActivityPhoto(ActivityPhotoDTO dto);
	
	// update
	public abstract int updatePetsitterProfile(PetsitterProfileDTO dto);
	public abstract int updateServiceType(ServiceTypeDTO dto);	
	public abstract int updatePetsitterSkill(PetsitterSkillDTO dto);
	public abstract int updateServicePetkinds(ServicePetkindsDTO dto);
	public abstract int updateServiceCalendar(ServiceCalendarDTO dto);
	public abstract int updateActivityPhoto(ActivityPhotoDTO dto);
	
	public abstract int mergeServiceType(ServiceTypeDTO dto);
	public abstract int mergeSkillType(PetsitterSkillDTO dto);
	public abstract int mergePetType(ServicePetkindsDTO dto);
	
} // end interface	