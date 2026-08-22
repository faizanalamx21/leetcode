class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;

            nodelete = Math.max(arr[i], prevnodelete + arr[i]);

            if (prevonedelete == Integer.MIN_VALUE) {
                onedelete = prevnodelete;
            } else {
                onedelete = Math.max(prevnodelete, prevonedelete + arr[i]);
            }

            result = Math.max(result, Math.max(nodelete, onedelete));
        }

        return result;
    }
}