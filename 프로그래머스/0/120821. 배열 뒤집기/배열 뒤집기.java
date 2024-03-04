class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [num_list.length];
        for(int i = num_list.length - 1, k = 0; i >= 0; i--, k++){
            answer[k] = num_list[i];
        }
        return answer;
    }
}