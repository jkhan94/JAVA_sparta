package week2;

import java.util.*;

/*- 입력값
    - 저장할 자료구조명을 입력합니다. (List / Set / Map)
    - 내가 좋아하는 요리 제목을 먼저 입력합니다.
    - 이어서 내가 좋아하는 요리 레시피를 한 문장씩 입력합니다.
    - 입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.
- 출력값
    - 입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력해 줍니다.
    - 이어서, 입력한 모든 문장 앞에 번호를 붙여서 입력 순서에 맞게 모두 출력해 줍니다.

입력예시
Set
백종원 돼지고기 김치찌개 만들기
돼지고기는 핏물을 빼주세요.
잘익은 김치 한포기를 꺼내서 잘라주세요.
냄비에 들기름 적당히 두르고 김치를 넣고 볶아주세요.
다진마늘 한스푼, 설탕 한스푼 넣어주세요.
종이컵으로 물 8컵 부어서 센불에 끓여주세요.
핏물 뺀 돼지고기를 넣어주세요.
된장 반스푼, 양파 반개, 청양고추 한개를 썰어서 넣어주세요.
간장 두스푼반, 새우젓 두스푼, 고춧가루 두스푼반 넣어주세요.
중불로 줄여서 오래 끓여주세요~!!
마지막에 파 쏭쏭 썰어서 마무리하면 돼요^^
끝

출력예시
[ Set 으로 저장된 백종원 돼지고기 김치찌개 만들기 ]
1. 돼지고기는 핏물을 빼주세요.
2. 잘익은 김치 한포기를 꺼내서 잘라주세요.
3. 냄비에 들기름 적당히 두르고 김치를 넣고 볶아주세요.
4. 다진마늘 한스푼, 설탕 한스푼 넣어주세요.
5. 종이컵으로 물 8컵 부어서 센불에 끓여주세요.
6. 핏물 뺀 돼지고기를 넣어주세요.
7. 된장 반스푼, 양파 반개, 청양고추 한개를 썰어서 넣어주세요.
8. 간장 두스푼반, 새우젓 두스푼, 고춧가루 두스푼반 넣어주세요.
9. 중불로 줄여서 오래 끓여주세요~!!
10. 마지막에 파 쏭쏭 썰어서 마무리하면 돼요^^
    */
public class Homework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Set<String> set = new LinkedHashSet<>();
        Map<Integer, String> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        String dataStructure, foodName, description;

        // 자료구조명
        System.out.println("Enter Data Structure name: ");
        dataStructure = sc.nextLine();
        // 음식 이름
        System.out.println("Enter recipe name: ");
        foodName = sc.nextLine();

        // 음식 설명
        System.out.println("Enter recipe description. 입력을 완료하면 끝 을 입력해주세요. ");
        switch (dataStructure) {
            case "list":
                list.add(dataStructure);
                list.add(foodName);
                while (true) {
                    description = sc.nextLine();
                    if (description.equals("끝")) {
                        break;
                    }
                    list.add(description);
                }
                // list 출력
                System.out.println("[ " + list.get(0) + "으로 저장된 " + list.get(1) + " ]");
                for (int i = 2; i < list.size(); i++) {
                    System.out.println((i - 1) + ". " + list.get(i));
                }
                break;
            case "set":
                set.add(dataStructure);
                set.add(foodName);
                while (true) {
                    description = sc.nextLine();
                    if (description.equals("끝")) {
                        break;
                    }
                    set.add(description);
                }
                // set 출력
                Iterator<String> iter = set.iterator();
                System.out.println("[ " + iter.next() + "으로 저장된 " + iter.next() + " ]");
                int i = 1;
                while (iter.hasNext()) {
                    System.out.println(i + ". " + iter.next());
                    i++;
                }
                break;
            case "map":
                int idx = 0;
                map.put(idx, dataStructure);
                idx++;
                map.put(idx, foodName);
                idx++;
                while (true) {
                    description = sc.nextLine();
                    if (description.equals("끝")) {
                        break;
                    }
                    map.put(idx, description); //2번부터 음식 설명
                    idx++;
                }
                idx = 0;
                System.out.println("[ " + map.get(idx++) + "으로 저장된 " + map.get(idx) + " ]");
                for (idx = 2; idx < map.size(); idx++) {
                    System.out.println((idx - 1) + ". " + map.get(idx));
                }
                break;
        }
        sc.close();
    }
}
