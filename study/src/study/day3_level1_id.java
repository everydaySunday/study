package study;

public class day1 {

	public int[] solution(String new_id) {
        String answer = new_id.toLowerCase();    // 1
        

        // 2 indexOF replaceOf
        answer = answer.replaceAll("[^a-z0-9-_.]","");
        // 3 new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
        // \d+[.] (\d{3,})
        answer = answer.replaceAll("[.]{2,}","");

        // 4 new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
        answer = answer.replaceAll("^[.]|[.]$","");
        // 5
        if (answer.length() == 0){
            answer += "a";
        }
        
        if (answer.length() >= 16){
            answer = answer.substring(0,15);
            answer = answer.replaceAll("^[.]|[.]$","");
        }
        
        if (answer.length() <= 2 ) {
            while(answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        }
        return answer;
    }
}
