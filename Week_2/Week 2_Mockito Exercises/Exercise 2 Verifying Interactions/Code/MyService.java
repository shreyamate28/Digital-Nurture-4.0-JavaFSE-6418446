public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void fetchData() {
        // Simulate business logic
        api.getData(); // interaction to verify
    }
}
