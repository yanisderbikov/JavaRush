package Algorithms.trash.yandex;

class Main {
    public static void main(String[] args) {
        Exist_Ones exist_ones = new Exist_Ones();
        int[] arr = {1, 2, 3, 1, 2, 5, 3};
        int a = exist_ones.findOneExistNumber(arr);
        System.out.println(a);

        MaxValueOfLeaves l = new MaxValueOfLeaves();
        TreeNode treeNode = new TreeNode(1,
                new TreeNode(2, new TreeNode(1, new TreeNode(9), null), new TreeNode(7)),

                new TreeNode(9, new TreeNode(5, new TreeNode(7), null), new TreeNode(2)));
        var res = l.maxValueOfLeave(treeNode);
        System.out.println(res);
    }
}
