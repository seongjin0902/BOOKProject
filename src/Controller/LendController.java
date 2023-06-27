package Controller;

import java.util.Map;

import Domain.Common.Dto.LendDto;

public class LendController {
//	1 select, 2 insert, 3 update, 4 delete
	public void execute(int ServiceNo, Map<String, Object> param) {

		if (ServiceNo == 1) {
//			1 파라미터 추출(생략)
//			2 입력값 검증(생략)
//			3 서비스 실행(서비스모듈작업 이후 처리)
//			4 view로 전달
			System.out.println("Lend_Select Block!");
		} else if (ServiceNo == 2) {
//			1 파라미터 추출
			Integer bookcode = (Integer) param.get("bookcode");
			String id = (String) param.get("id");

//			2 입력값 검증
			if (bookcode == null || id == null) {
				System.out.println("[ERROR] Data Validation Check Error!");
				return;
			}
//			3 서비스 실행
			LendDto dto = new LendDto(0, bookcode, id, null, null);
			System.out.println("Dto : " + dto);
//			4 view로 전달
			System.out.println("Lend_Insert Block!");
		} else if (ServiceNo == 3) {
//			1 파라미터 추출
//			2 입력값 검증
//			3 서비스 실행
//			4 view로 전달
			System.out.println("Lend_Update Block!");
		} else if (ServiceNo == 4) {
//			1 파라미터 추출
			Integer bookcode = (Integer) param.get("bookcode");
			String id = (String) param.get("id");

//			2 입력값 검증
			if (bookcode == null || id == null) {
				System.out.println("[ERROR] Data Validation Check Error!");
				return;
			}
//			3 서비스 실행
			LendDto dto = new LendDto(0, bookcode, id, null, null);
			System.out.println("Dto : " + dto);
//			4 view로 전달
			System.out.println("Lend_Delete Block!");
		}
	}

}
