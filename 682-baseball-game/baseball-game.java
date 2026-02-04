// class Solution {
//     public int calPoints(String[] operations) {

//         Stack<Integer> stack = new Stack<>();

//         for(String op : operations) {
//             if(op.equals("C")) stack.pop();
//             else if(op.equals("D")) stack.push(2 * stack.peek());
//             else if(op.equals("+")) {
//                 int top = stack.pop();
//                 int newScore = top + stack.peek();
//                 stack.push(top);
//                 stack.push(newScore);
//             }
//             else stack.push(Integer.parseInt(op));
//         }

//         int sum = 0;
//         for(int n : stack) {
//             sum += n;
//         }

//         return sum;
//     }
// }





class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();

        for(String op : operations) {
            int n = list.size();

            if(op.equals("C")) list.remove(n-1);

            else if(op.equals("D")) list.add(2 * list.get(n-1));

            else if(op.equals("+")) list.add(list.get(n-1) + list.get(n-2));

            else list.add(Integer.parseInt(op));
        }

        int sum = 0;
        for(int x : list) {
            sum += x;
        }
        
        return sum;
    }
}