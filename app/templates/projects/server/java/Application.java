package <%= package %>;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import <%= package %>.backend.DatabaseBackend;
import <%= package %>.resource.TestResource;

/**
 * Main entry point to the <%= name %> API server.
 */
public final class <%= className %>Application extends Application<<%= className %>Configuration> {

    public static void main(final String[] args) throws Exception {
        new <%= className %>Application().run(args);
    }

    @Override
    public void initialize(Bootstrap<<%= className %>Configuration> bootstrap) {

    }

    @Override
    public void run(final <%= className %>Configuration configuration, final Environment environment) {
        DatabaseBackend databaseBackend = configuration.getDatabaseBackend(environment);

        environment.jersey().register(new TestResource());
    }
}
