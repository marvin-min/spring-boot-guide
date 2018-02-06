import redis.clients.jedis.Jedis;

public class Test {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.99.100",6379);
        String name = jedis.get("testMessage");
        System.out.println(name);
    }
}
