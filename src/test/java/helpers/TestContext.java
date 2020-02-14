package helpers;

public class TestContext
{
    private static final ThreadLocal<TestContext> THREAD_LOCAL = new ThreadLocal<>();

    private TestContext()
    {

    }

    public static TestContext get()
    {
        return THREAD_LOCAL.get();
    }

    public static void init()
    {
        THREAD_LOCAL.set(new TestContext());
    }



}
