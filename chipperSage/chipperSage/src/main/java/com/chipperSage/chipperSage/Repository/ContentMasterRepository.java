package com.chipperSage.chipperSage.Repository;

import com.chipperSage.chipperSage.Model.ContentMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentMasterRepository extends JpaRepository<ContentMaster, Integer> {
}
