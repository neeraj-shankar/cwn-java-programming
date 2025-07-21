# Interacting with Operating Systems

## File Path Separators in Different OSes
| OS      | Separator | Example Path                         |
| ------- | --------- | ------------------------------------ |
| Windows | `\`       | `C:\Users\Neeraj\Documents\file.txt` |
| Linux   | `/`       | `/home/neeraj/file.txt`              |
| macOS   | `/`       | `/Users/neeraj/file.txt`             |

## Best Practice for Cross-Platform File Handling
Always use:
- Paths.get(...) or File.separator
- Avoid hardcoding paths
- For external resources (like config files), load them from the classpath using getClass().getResource() or ClassLoader