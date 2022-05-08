class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int res = 0;
        for(int i = 0; i <seats.length; i++) {
            res += (seats[i] > students[i]) ? seats[i] - students[i] : students[i] -seats[i];
        }
        return res;
    }
}