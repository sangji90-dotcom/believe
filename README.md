# Belive Project (물건 대여 사이트)

## 📌 프로젝트 소개

물건을 서로 빌려주고 빌릴 수 있는 **물건 대여 웹 사이트**입니다.
사용자는 카테고리를 선택하여 게시글을 확인하고,
필터 기능을 통해 원하는 물품을 쉽게 찾을 수 있습니다.

---

## 👨‍💻 담당 기능

카테고리 및 게시글 필터링 기능 구현

### 카테고리

* 공구
* 음악
* 캠핑용품
* 스포츠
* 디지털
* 패션
* 유아용품

### 필터 기능

* 빌려드립니다 (LEND)
* 빌려주세요 (BORROW)
* 대여 가능 여부

  * AVAILABLE
  * RENTED

---

## 🏗 프로젝트 구조 (3-Tier Architecture)

```
Controller
   ↓
Service
   ↓
DAO
   ↓
Database
```

---

## 📂 프로젝트 구조

```
rental-project
│
├─ database
│   ├─ schema.sql
│   └─ data.sql
│
├─ src
│   └─ main
│       ├─ java
│       │   └─ com/rental
│       │       ├─ controller
│       │       ├─ dao
│       │       ├─ dto
│       │       └─ service
│       │
│       ├─ resources
│       │   └─ mapper
│       │
│       └─ webapp
│           └─ WEB-INF
│               └─ views
```

---

## ⚙ 기술 스택

* Java
* Spring MVC
* MyBatis
* JSP / JSTL
* MySQL
* Maven
* Git / GitHub

---

## 🗄 데이터베이스

### 주요 테이블

* user
* post
* rental
* comment

---

## 🔎 주요 기능

### 1️⃣ 카테고리 목록

카테고리를 선택하여 게시판 이동

### 2️⃣ 게시글 조회

게시글 목록을 데이터베이스에서 조회

### 3️⃣ 게시글 필터링

* 카테고리
* 빌려드립니다 / 빌려주세요
* 대여 가능 여부

---

## 🚀 실행 방법

1. 데이터베이스 생성
2. `schema.sql` 실행
3. `data.sql` 실행
4. 프로젝트를 Eclipse에서 Maven 프로젝트로 Import

---

## 📎 GitHub

https://github.com/sangji90-dotcom/rental-project
