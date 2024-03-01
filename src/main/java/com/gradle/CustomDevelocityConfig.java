package com.gradle;

import com.gradle.ccud.adapters.BuildCacheApiAdapter;
import com.gradle.ccud.adapters.BuildScanApiAdapter;
import com.gradle.ccud.adapters.CoreApiAdapter;

/**
 * Provide standardized Develocity configuration.
 * By applying the extension, these settings will automatically be applied.
 */
final class CustomDevelocityConfig {

    void configureDevelocity(CoreApiAdapter develocity) {
        /* Example of Develocity configuration

        develocity.setServer("https://enterprise-samples.gradle.com");
        develocity.setAllowUntrustedServer(false);

        */
    }

    void configureBuildScanPublishing(BuildScanApiAdapter buildScans) {
        /* Example of build scan publishing configuration

        boolean isCiServer = System.getenv().containsKey("CI");

        buildScans.publishAlways();
        buildScans.capture(capture -> capture.setGoalInputFiles(true));
        buildScans.setUploadInBackground(!isCiServer);

        */
    }

    void configureBuildCache(BuildCacheApiAdapter buildCache) {
        /* Example of build cache configuration

        boolean isCiServer = System.getenv().containsKey("CI");

        // Enable the local build cache for all local and CI builds
        // For short-lived CI agents, it makes sense to disable the local build cache
        buildCache.getLocal().setEnabled(true);

        // Only permit store operations to the remote build cache for CI builds
        // Local builds will only read from the remote build cache
        buildCache.getRemote().setEnabled(true);
        buildCache.getRemote().setStoreEnabled(isCiServer);

        */
    }

}
