/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.to52.dao;

import fr.utbm.to52.domain.Author;
import fr.utbm.to52.domain.Member;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author adilsoncapaia
 */
@Repository
public interface MemberDao extends JpaRepository<Member, Long>{
    
    
    List<Member> findByLastNameIgnoreCase(String last);
    Member findByEmailIgnoreCase(String email);
   
    
}
