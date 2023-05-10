public class MyResource {
    @Override
    protected void finalize() throws Throwable {
        try {
		System.out.println("Res free");
        } finally {
            super.finalize();
        }
    }
}
