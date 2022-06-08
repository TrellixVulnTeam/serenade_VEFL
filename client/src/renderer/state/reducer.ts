import { core } from "../../gen/core";

const initialState = {
  alternatives: [],
  alternativesSpinner: [],
  animations: false,
  app: "",
  autocomplete: [],
  chunkSilenceThreshold: 0.1,
  chunkSpeechThreshold: 0.3,
  continueRunningInTray: false,
  // the user's preference for dark mode: "system", "light", or "dark"
  darkMode: "system",
  // the current theme: true if darkMode is "dark" or "system" and the OS is dark
  darkTheme: false,
  debug: false,
  dictateMode: false,
  disableSuggestions: false,
  endpoint: {},
  editorAutocomplete: false,
  endpoints: [],
  error: {},
  executeSilenceThreshold: 1,
  filename: "",
  highlighted: [],
  language: core.Language.LANGUAGE_DEFAULT,
  languageSwitcherLanguage: core.Language.LANGUAGE_NONE,
  latency: 1,
  listening: false,
  loading: {},
  loadingPageProgress: 0,
  loadingPageMessage: "",
  localLoading: false,
  localVersion: undefined,
  logAudio: true,
  logSource: true,
  loggedIn: undefined,
  microphones: [],
  miniMode: true,
  miniModeBottomUp: false,
  miniModeFewerAlternativesCount: 5,
  miniModeHideTimeout: 5,
  miniModeReversed: true,
  minimizedPosition: "top-right",
  nuxCompleted: true,
  nuxHintShown: false,
  nuxNextButtonEnabled: false,
  nuxStep: null,
  nuxTutorial: "",
  partial: false,
  plugins: [],
  pluginInstalled: false,
  pushToTalk: "Alt+Space",
  requiresNewerMac: false,
  requiresWsl: false,
  revisionBoxMode: "text",
  scriptError: "",
  settingsPage: "general",
  showRevisionBox: {},
  sourceAvailable: false,
  speaking: false,
  speakingVolume: 0,
  suggestion: "",
  statusText: "Paused",
  stylers: {},
  textInputKeyBinding: "Ctrl+Alt+Space",
  useMiniModeFewerAlternatives: false,
  useMiniModeHideTimeout: false,
  useVerboseLogging: false,
  updateNotification: "",
  volume: 0,
};

export default function reduce(state = initialState, action: any) {
  let result = Object.assign({}, state, action);
  delete result["type"];
  return result;
}
