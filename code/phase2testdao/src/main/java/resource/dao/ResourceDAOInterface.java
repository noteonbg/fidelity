package resource.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import resource.model.Resource;

@Repository
public interface ResourceDAOInterface extends JpaRepository<Resource, Integer>{
	
	
	List<Resource> findByAvaialability(boolean status);
	//the class which implements this interface is not creaed by us
	//it is created by spring framework.. spring tells be happy with 4
	//dont bother about 3.. what you are expecting i will give you..
	
	

}
