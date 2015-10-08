package mil.nga.giat.geowave.core.cli;

import org.apache.commons.cli.CommandLine;

public class CommandLineResult<T>
{
	private final T result;
	private final boolean commandLineChange;
	private final CommandLine commandLine;

	public CommandLineResult(
			final T result ) {
		this(
				result,
				false,
				null);
	}

	public CommandLineResult(
			final T result,
			final boolean commandLineChange,
			final CommandLine commandLine ) {
		this.result = result;
		this.commandLineChange = commandLineChange;
		this.commandLine = commandLine;
	}

	public T getResult() {
		return result;
	}

	public boolean isCommandLineChange() {
		return commandLineChange;
	}

	public CommandLine getCommandLine() {
		return commandLine;
	}
}