# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [0.7.3] - 2022-06-16
### Fixed
- Set sync status when the sync is started instead of when the sync is scheduled.

## [0.7.2] - 2022-05-19
### Fixed
- Group By fixes

## [0.7.1] - 2022-02-02
### Fixed
- Fix no-op grouping for raw queries that were causing intermittently failing queries.
- Fix worker fetching wrong columns selector.

### Security
- Update dependencies.

## [0.7.0] - 2021-12-09
### Added
- `count` aggregation for time series queries.

## [0.6.1] - 2021-11-25
### Fixed
- Add proper delete edge resolution for native incremental sync.

## [0.6.0] - 2021-11-15
### Added
- Multiple DataSeries support for tasks/workers.
- Better interval support with [mhdwMy] units that supports month and year time buckets that match calendar months and years perfectly.

### Fixed
- JSON ingest parsing bug introduced in 0.4.0.
- SQL date parsing.
- Show worker columns on worker page when no series keys are defined.

## [0.5.1] - 2021-10-15
### Changed
- Allow batched result upload from worker.

## [0.5.0] - 2021-10-13
### Changed
- Split DataConnection and DataSeries creation phases for JDBC.
- Improve import worker error messages.

### Fixed
- Import worker DataConnection assignment with definition id.
- Allow registering multiple workers with the same definition.

## [0.4.1] - 2021-09-24
### Added
- Improved incremental sync with query range restriction.
- Data connection edit.

### Security
- Remove hardcoded credentials.

## [0.4.0] - 2021-08-25
### Added
- Import worker.
- Incremental data sync for import worker.
- Task list filtering by status.
- Logback config.
- CSV output for query API.

### Changed
- Rename `type` to `valueType` in column data models.
- Update anomaly data model.
- Add env variable controlled logback config.
- Allow reuse of deleted task names.
- Make data sync asynchronous.
- Allow querying raw data from all `DataSeries` columns.

### Removed
- Direct Quartz Scheduler dependency for scheduling.

### Fixed
- Fix JSON ingest collection parsing.

## [0.3.5] - 2021-07-19
### Changed
- Register the timestamp converter globally.

## [0.3.4] - 2021-07-16
### Fixed
- Fix `SeriesResult*Selector` validation sequencing.

## [0.3.3] - 2021-07-16
### Fixed
- Add explicit defaults for primitive value properties.

## [0.3.2] - 2021-07-16
### Fixed
- Fix Timestamp to Instant conversion when querying data.

## [0.3.1] - 2021-07-14
### Changed
- Upgraded to `snoozy-starter` 0.7.4.
- Apply limit/offset pagination to all data fetches.

## [0.3.0] - 2021-03-19
### Added
 - Add support for `distinct` aggregation
