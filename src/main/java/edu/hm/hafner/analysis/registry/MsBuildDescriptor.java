package edu.hm.hafner.analysis.registry;

import edu.hm.hafner.analysis.IssueParser;
import edu.hm.hafner.analysis.parser.MsBuildParser;

/**
 * A descriptor for MS Build messages.
 *
 * @author Lorenz Munsch
 */
class MsBuildDescriptor extends ParserDescriptor {
    private static final String ID = "msbuild";
    private static final String NAME = "MSBuild";

    MsBuildDescriptor() {
        super(ID, NAME);
    }

    @Override
    public IssueParser createParser(final Option... options) {
        return new MsBuildParser();
    }
}
