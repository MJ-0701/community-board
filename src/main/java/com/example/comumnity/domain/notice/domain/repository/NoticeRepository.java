package com.example.comumnity.domain.notice.domain.repository;


import com.example.comumnity.domain.notice.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
