	let rolloutDurationMs = undefined;

	// If the build is insiders or exploration, start a rollout of 4 hours
	if (quality === 'insiders') {
		rolloutDurationMs = 4 * 60 * 60 * 1000; // 4 hours
	}

	const scripts = client.database('builds').container(quality).scripts;
	await retry(() => scripts.storedProcedure('releaseBuild').execute('', [commit, rolloutDurationMs]));
}

const [, , force] = process.argv;