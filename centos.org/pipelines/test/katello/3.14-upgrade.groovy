def playBookVars() {
    playBook = ['boxes': ['pipeline-upgrade-katello-3.14-centos7'], 'pipeline': 'upgrade_pipeline.yml', 'extraVars': ['pipeline_version': '3.14', 'pipeline_os': 'centos7', 'pipeline_type': 'katello']]
    return playBook
}