
package org.apache.surefire.stdout.corrupt;


import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.engine.reporting.ReportEntry;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JUnitTestListener implements TestExecutionListener {

    private static final Logger LOG = LoggerFactory.getLogger(JUnitTestListener.class);
    
    @Override
    public void testPlanExecutionStarted(TestPlan testPlan) {
    }

    @Override
    public void testPlanExecutionFinished(TestPlan testPlan) {
    }

    @Override
    public void dynamicTestRegistered(TestIdentifier testIdentifier) {
    }

    @Override
    public void executionSkipped(TestIdentifier testIdentifier, String reason) {
    }

    @Override
    public void executionStarted(TestIdentifier testIdentifier) {
        LOG.info("Call executionStarted with " + testIdentifier);
    }

    @Override
    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
        LOG.info("Call executionFinished with " + testIdentifier);
    }

    @Override
    public void reportingEntryPublished(TestIdentifier testIdentifier, ReportEntry entry) {
    }
}
