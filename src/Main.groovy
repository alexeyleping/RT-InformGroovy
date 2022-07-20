class Main {
    static void main(String[] args) {
        Integer[] arr = [1, 3, 4, 5, 1, 5, 4];
        Map counts = arr.countBy { it }
        counts.findAll { it.value == counts.values().max() }
        println counts;
    }
}
