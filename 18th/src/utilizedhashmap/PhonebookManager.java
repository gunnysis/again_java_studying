package utilizedhashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class PhonebookManager {
    public static void main(String[] args) {
        // 이름을 키로, 전화번호를 값으로 가지는 전화번호부 프로그램
        // HashMap<String, String>을 사용하여 이름과 전화번호를 저장합니다.
        // 이름을 입력받아 해당 이름의 전화번호를 출력하는 기능을 구현합니다.
        // 전화번호부에 새로운 항목을 추가하고, 기존 항목을 수정 및 삭제하는 기능을 구현합니다.

        HashMap<String, String> phonebook = new HashMap<>(){
            @Override
            public String toString() {
                String result = "";
                Iterator<String> iterator = super.keySet().iterator();
                while (iterator.hasNext()) {
                    String key = iterator.next();
                    result += key+": "+this.get(key)+"\n";
                }
                return result;
            }
        };

        phonebook.put("gunny", "01012341234");
        phonebook.put("park", "01077777777");
        phonebook.put("test", "01033333333");

        String input = "park";
        ArrayList<HashMap<String, String>> phonebookList = new ArrayList<>();
        phonebookList.add(phonebook);

        phonebookList.stream().forEach(System.out::print);

    }
}
