package io.kestra.plugin.fs.ftp;

import io.kestra.plugin.fs.AbstractFileTriggerTest;
import io.kestra.plugin.fs.vfs.Upload;
import jakarta.inject.Inject;

class TriggerTest extends AbstractFileTriggerTest {
    @Inject
    private FtpUtils ftpUtils;

    @Override
    public Upload.Output upload(String to) throws Exception {
        return this.ftpUtils.upload(to);
    }

    @Override
    protected String triggeringFlowId() {
        return "ftp-listen";
    }
}
