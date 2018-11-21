package com.example.demo.domain;

public interface HotelSummary {

//	City getCity();
//
//	String getName();
//
//	Double getAverageRating();
//
//	default Integer getAverageRatingRounded() {
//		return getAverageRating() == null ? null : (int) Math.round(getAverageRating());
//	}
	
	//多表查询
//	@Query("select h.city as city, h.name as name, avg(r.rating) as averageRating "
//			- "from Hotel h left outer join h.reviews r where h.city = ?1 group by h")
//	Page<HotelSummary> findByCity(City city, Pageable pageable);
//
//	@Query("select h.name as name, avg(r.rating) as averageRating "
//			- "from Hotel h left outer join h.reviews r  group by h")
//	Page<HotelSummary> findByCity(Pageable pageable);
	
	//在运行中Spring会给接口（HotelSummary）自动生产一个代理类来接收返回的结果，代码汇总使用getXX的形式来获取
//	Page<HotelSummary> hotels = this.hotelRepository.findByCity(new PageRequest(0, 10, Direction.ASC, "name"));
//	for(HotelSummary summay:hotels){
//			System.out.println("Name" +summay.getName());
//		}

}